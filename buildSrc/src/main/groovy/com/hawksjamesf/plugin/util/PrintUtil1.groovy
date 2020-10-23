package com.hawksjamesf.plugin.util
interface Color {
    public static final String ANSI_RESET = "\u001B[0m"
    public static final String  ANSI_BLACK = "\u001B[30m"
    public static final String  ANSI_RED = "\u001B[31m"
    public static final String  ANSI_GREEN = "\u001B[32m"
    public static final String  ANSI_YELLOW = "\u001B[33m"
    public static final String  ANSI_BLUE = "\u001B[34m"
    public static final String  ANSI_PURPLE = "\u001B[35m"
    public static final String  ANSI_CYAN = "\u001B[36m"
    public static final String  ANSI_WHITE = "\u001B[37m"

    public static final String  ANSI_BLACK_BACKGROUND = "\u001B[40m"
    public static final String  ANSI_RED_BACKGROUND = "\u001B[41m"
    public static final String  ANSI_GREEN_BACKGROUND = "\u001B[42m"
    public static final String  ANSI_YELLOW_BACKGROUND = "\u001B[43m"
    public static final String  ANSI_BLUE_BACKGROUND = "\u001B[44m"
    public static final String  ANSI_PURPLE_BACKGROUND = "\u001B[45m"
    public static final String  ANSI_CYAN_BACKGROUND = "\u001B[46m"
    public static final String  ANSI_WHITE_BACKGROUND = "\u001B[47m"
}
static def printError(Object message) {
    println("${Color.ANSI_RED}${message}${Color.ANSI_RESET}")
}

static def printWarn(Object message) {
    println("${Color.ANSI_YELLOW}$message${Color.ANSI_RESET}")
}

static def printInfo(Object message) {
    println("${Color.ANSI_GREEN}$message${Color.ANSI_RESET}")
}

static def printDebug(Object message) {
    println("${Color.ANSI_BLUE}$message${Color.ANSI_RESET}")
}

static def printVerbose(Object message) {
    println(message)
}

