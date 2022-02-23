import java.util.logging.FileHandler
import java.util.logging.Formatter
import java.util.logging.LogRecord

// filebot -script "E:\Temp\Filebot\TheRenamer.groovy"

class TimFormatter extends Formatter {
    @Override
    public String format(final LogRecord record) {
        return String.format("%1\$s %n", formatMessage(record))
    }
}

final String TEST_INPUT_PATH = /E:\\Temp\Test/
final String TEST_OUTPUT_PATH = /E:\\Temp\Test output/
final String TEST_LOG_PATH = /E:\\testLog.log/


final String TV_INPUT_PATH = /\\colonuc\d$\temp\Incoming TV/
final String MOVIE_INPUT_PATH = /\\colonuc\d$\temp\Incoming Movies/
final String ANIME_INPUT_PATH = /\\colonuc\d$\Temp\Incoming Anime/
final String LOG_PATH = /E:\\filebot.log/

final String TV_OUTPUT_PATH = /\\mixvault\Plex\Data\TV/
final String MOVIE_OUTPUT_PATH = /\\mixvault\Plex\Data\Movies/
final String ANIME_OUTPUT_PATH = /\\mixvault\Plex\Data\Anime/

final String TV_AND_MOVIE_FORMAT = '{plex.tail}'
final String ANIME_FORMAT = /{n}\{n} - {s00e00} - {t}/


FileHandler logOutput = new FileHandler(TEST_LOG_PATH, true)
logOutput.setFormatter(new TimFormatter())
log.addHandler(logOutput)
log.info "\n\n\n\n**********Now Looking for Files**********"


log.info "\n**********Checking for TV Shows**********"
[TV_INPUT_PATH as File].eachMediaFolder {
    rename(folder:it, db:'TheTVDB', output:TV_OUTPUT_PATH, format:TV_AND_MOVIE_FORMAT, strict:false)
}


log.info "\n**********Checking for Movies**********"
[MOVIE_INPUT_PATH as File].eachMediaFolder {
    rename(folder:it, db:'TheMovieDB', output:MOVIE_OUTPUT_PATH, format:TV_AND_MOVIE_FORMAT, strict:false)
}

log.info "\n**********Checking for Anime**********"
[ANIME_INPUT_PATH as File].eachMediaFolder {
    rename(folder:it, db:'AniDB', output:ANIME_OUTPUT_PATH, format:ANIME_FORMAT, strict:false)
}

log.info "\n**********Cleaning Directories**********"
def allowedExtensions = ["mp4", "mkv", "avi", "srt"]
def clean
clean = {

    if (it.isDirectory()) {
        if (it.listFiles().length == 0) {it.delete()}
        else {
            File[] files = it.listFiles()
            files.each {
                String name = it.getName()
                if (it.isDirectory()) {
                    clean(it)
                } else if (!allowedExtensions.any {name.contains(it)}) {
                    it.delete()
                }
            }
            if (it.listFiles().length == 0) {it.delete()}
        }
    } else {
        String fileName = it.getName()
        int i = fileName.lastIndexOf(".")
        String fileType = fileName.substring(i)

        if (!fileType.equals('mkv') && !fileType.equals('avi')) {
            it.delete()
        }
    }
}

def cleanDir = {
    File dir = new File(it)
    File[] files = dir.listFiles()

    files.each {
        clean(it)
    }

}

[TV_INPUT_PATH, MOVIE_INPUT_PATH, ANIME_INPUT_PATH].each{cleanDir(TEST_INPUT_PATH)}

log.info("**********now Exiting**********")