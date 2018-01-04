node("cd") {
    git url: "https://github.com/ylebret/${serviceName}.git"
    dockerFlow(serviceName, ["deploy", "proxy", "stop-old"])
}