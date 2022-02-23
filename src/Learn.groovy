class Learn {
    mynas/media/Movies/ {collection.replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/).replaceFirst(/^(?i)(Collection of the)\s(.+)/, /$2 Collection/)
            .replaceAll(/Saga Collection/, "Saga").replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!")
            .replaceAll(/[*\s]+/, " ")}\{norm = {it.upperInitial().lowerTrail().replaceTrailingBrackets()
            .replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ")
            .replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ")
            .replaceAll(/ Ii/, " II").replaceAll(/ IIi/, " III").replaceAll(/ Iv /, " IV ").replaceAll(/ Vi /, " VI ")
            .replaceAll(/ Vii/, " VII").replaceAll(/ Viii/, " VIII").replaceAll(/ Ix/, " IX").replaceAll(/ Xii/, " XII")
            .replaceAll(/ XIIi/, " XIII").replaceAll(/ Xiv/, " XIV").replaceAll(/ Xv/, " XV").replaceAll(/ Xvi/, " XVI")
            .replaceAll(/ Xvii/, " XVII").replaceAll(/ Xviii/, " XVIII").replaceAll(/ Xix/, " XIX").replaceAll(/ Xx/, " XX")
            .replaceAll(/ Xxx/, " XXX").replaceAll(/1St/, "1st").replaceAll(/2Nd/, "2nd").replaceAll(/3Rd/, "3rd").replaceAll(/4Th/, "4th")
            .replaceAll(/5Th/, "5th").replaceAll(/6Th/, "6th").replaceAll(/7Th/, "7th").replaceAll(/8Th/, "8th").replaceAll(/9Th/, "9th")
            .replaceAll(/0Th/, "0th").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}; norm(n)}{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""} ({y}{' '+any{imdb.certification}{certification}
            .replaceAll(/^\d+$/, 'PG-$0')})/{norm(n)}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
    {fn.contains('Extended') || fn.contains('EXTENDED') || fn.contains('extended.cut') ? ' (Extended)' : fn.contains('Special Edition') || fn.contains('SPECIAL EDITION') || fn.contains('SPECIAL.EDITION') ? ' (Special Edition)' : fn.contains('Unrated') || fn.contains('UNRATED') ? ' (Unrated)' : fn.contains('Uncensored') || fn.contains('UNCENSORED') ? ' (Uncensored)' : fn.contains('Remastered') || fn.contains('REMASTERED') ? ' (Remastered)':""}
    {" Part $pi"}{" [$vf $vc $ac $af]"}


    mynas/media/Movies/{collection.replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/).replaceFirst(/^(?i)(Collection of the)\s(.+)/, /$2 Collection/)
            .replaceAll(/Saga Collection/, "Saga").replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!")
            .replaceAll(/[*\s]+/, " ")}

            \{norm = {it.upperInitial().lowerTrail().replaceTrailingBrackets().replaceAll(/[`´‘’ʻ""“”]/, "'")
            .replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper() })
            .replaceAll(/\b[0-9](?i:th|nd|rd)\b/, { it.lower() }).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}; norm(n)}

            {if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""} ({y}{' '+any{imdb.certification}{certification}
            .replaceAll(/^\d+$/, 'PG-$0')})/{norm(n)}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|special[ ._-]edition/)*.upperInitial()*.lowerTrail().sort().join(', ')
            .replaceAll(/[.]/, " ") + ')'}{" Part $pi"}{" [$vf $vc $ac $af]"}





    {(x = n.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ")
            .replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/))}
    {if (x != (z = net.sourceforge.filebot.WebServices.AniDB.animeTitles.find{n == it.getOfficialTitle('en')}?.primaryTitle ?:
            n.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)))
        "["+z.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"] "}
    ({y}{" $certification"})/{n.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}
    - {absolute.pad(2)}{"Special "+special.pad(2)} - {t.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ")}{" ["+vf+" "+vc+" "+ac+" "+af+"]"}



    {norm = {it.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!")
            .replaceAll(/[*\s]+/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)};

        def np = net.sourceforge.filebot.WebServices.AniDB.animeTitles.find{n == it.getOfficialTitle('en')}?.primaryTitle; np == null || norm(n) == norm(np) ? norm(n) : norm(n)+' ['+norm(np)+']'}
    ({y}{" $certification"})/{norm(n)} - {absolute.pad(2)}{'Special '+special.pad(2)} - {norm(t)} {" [$vf $vc $ac $af]"}











    {n.replaceAll(/\b[IiVvXx]+\b/, { it.upper() })}
    {n.replaceAll(/\b[0-9](?i:th|nd)\b/, { it.lower() })}
    {'(' + fn.matchAll(/uncensored|remastered|unrated/)*.upperInitial()*.lowerTrail().sort().join(', ') + ')'}
}




{
    {(x = n.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ")
            .replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/))}
    {if (x != (z = net.sourceforge.filebot.WebServices.AniDB.animeTitles.find{n == it.getOfficialTitle('en')}?.primaryTitle ?:
            n.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)))

        "["+z.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"] "}


    ({y}{" $certification"})/{n.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}
    - {absolute.pad(2)}{"Special "+special.pad(2)} - {t.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ")}{" ["+vf+" "+vc+" "+ac+" "+af+"]"}



    {
        normSeriesName = n.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ")
                .replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)

        norm = {n, z ->
            n.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!")
                    .replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)
            "["+z.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"] "
        }

        getNormTitle = {
            z = net.sourceforge.filebot.WebServices.AniDB.animeTitles.find{n == it.getOfficialTitle('en')}?.primaryTitle ?: norm(n, z)}
        }

        if (normSeriesName != getNormTitle()) {
            "["+z.upperInitial().lowerTrail().replaceAll(/[`´‘’ʻ""“”]/, "'").replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!")
                    .replaceAll(/[*]/, " ").replaceAll(/[  ]/, " ").replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)+"] "}
        }





    //C + p
{norm = {it.upperInitial().lowerTrail().replaceTrailingBrackets().replaceAll(/[`´‘’?""“”]/, "'")
        .replaceAll(/[:|]/, " - ").replaceAll(/[?]/, "!").replaceAll(/[*\s]+/, " ").replaceAll(/\b[IiVvXx]+\b/, { it.upper() })
        .replaceAll(/\b[0-9](?i:th|nd|rd)\b/, { it.lower() }).replaceFirst(/^(?i)(The)\s(.+)/, /$2, $1/)}//;

    norm(n)}{if (norm(n) != norm(primaryTitle)) ' ('+norm(primaryTitle)+')'}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
({y}{' '+any{certification}{imdb.certification}.replaceAll(/^\d+$/, 'PG-$0')})/{norm(n)} - {absolute.pad(episodelist.size() < 99 ? 2 : 3)}
{'Special '+special.pad(episodelist.size() < 99 ? 2 : 3)} - {norm(t)}{fn.contains('3D') || fn.contains('3-D') ? ' '+'3D':""}
{' (' + fn.matchAll(/extended|uncensored|remastered|unrated|uncut|directors.cut|special.edition/)*
        .upperInitial()*.lowerTrail().sort().join(', ').replaceAll(/[._]/, " ") + ')'}{" Part $pi"}{" [$vf $vc $ac $af]"}
}




//The duke of death and his maid\The duke of death and his maid - S01E01 - ep name

{n}\{n} - {s00e00} - {t}






{'.-.'+vbr.upper().replaceAll(/[.]/, ",").replaceAll(/[ ]/, ".")}








//$now - timestamp?


// early abort if there is nothing to do
if (input.size() == 0) {
    die "No files selected for processing", ExitCode.NOOP
}



// make Plex scan for new content
if (plex) tryLogCatch {
    plex.each{ instance ->
        log.fine "Notify Plex: $instance"
        refreshPlexLibrary(instance.host, null, instance.token)
    }
}



def now = new Date().format("[MM/dd/yy HH:mm:ss]")

logHandler = new java.util.logging.FileHandler()
logHandler.pattern =