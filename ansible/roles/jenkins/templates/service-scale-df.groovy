node("cd") {
    git url: "https://github.com/ylebret/${serviceName}.git"
    dockerFlow(serviceName, ["scale", "proxy"], ["--scale=\"" + scale + "\""])
}