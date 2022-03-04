import java.text.SimpleDateFormat
import java.util.logging.FileHandler
import java.util.logging.Formatter
import java.util.logging.LogRecord

// filebot -script "E:\Temp\Filebot\Test.groovy"

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
//final String ANIME_FORMAT = /{n}\{n} - {s00e00} - {t}/
final String ANIME_FORMAT = /{n.sortName('$2, $1')}\{n} - {s00e00} - {t}/

final SimpleDateFormat timeFormat = new SimpleDateFormat("M/d/yy HH:mm:ss")
def root = ""
def anime = false

FileHandler logOutput = new FileHandler(TEST_LOG_PATH, true)
logOutput.setFormatter(new TimFormatter())
log.addHandler(logOutput)
log.info "\n\n\n\n**********[" + timeFormat.format(new Date()) + "] Looking for Files**********"

log.info "\n**********Checking for TV Shows**********"
root = TEST_INPUT_PATH
//process(root, 'TheTVDB', TEST_OUTPUT_PATH, TV_AND_MOVIE_FORMAT, false, root)

log.info "\n**********Checking for Movies**********"
root = TEST_INPUT_PATH
//process(root, 'TheMovieDB', TEST_OUTPUT_PATH, TV_AND_MOVIE_FORMAT, false, root)

log.info "\n**********Checking for Anime**********"
root = TEST_INPUT_PATH
anime = true
process(root, 'AniDB', TEST_OUTPUT_PATH, ANIME_FORMAT, false, root)

//TODO email/text if dir not empty?
//TODO email/text if multiple options? (encompassed by above?)

log.info("**********[" + timeFormat.format(new Date()) + "] Exiting**********")



private void process(String inPath, String dbIn, String outPath, String formatIn, boolean strictIn, String root) {
    def allowedExtensions = ["mp4", "mkv", "avi", "srt"]
    File dir = new File(inPath)
    if (!inPath.equals(root)) {
        if (anime) {
            rename(folder: inPath, db: dbIn, output: outPath, format: formatIn, strict: strictIn, )
        }


        File[] leftovers = dir.listFiles()

        leftovers.each {
            String name = it.getName()
            if (it.isDirectory()) {
                process(it.toString(), dbIn, outPath, formatIn, strictIn, root)
            } else if (!allowedExtensions.any { name.contains(it) }) {
                it.delete()
            }
        }

        if (dir.listFiles().length == 0) {
            dir.delete()
        }
    } else {
        File[] contents = dir.listFiles()

        contents.each {
            String name = it.getName()
            if (it.isDirectory()) { process(it.toString(), dbIn, outPath, formatIn, strictIn, root) }
            else if (!allowedExtensions.any {name.contains(it)}) { it.delete() }
            else {rename(file: it.getPath(), db: dbIn, output: outPath, format: formatIn, strict: strictIn)}
        }
    }

}