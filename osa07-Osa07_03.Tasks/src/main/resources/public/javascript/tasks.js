var url = contextRoot + "tasks"
var http = new XMLHttpRequest();

http.onreadystatechange = function() {
    if (this.readyState != 4 || this.status != 200) {
        return
    }
    
    var tasks = JSON.parse(this.responseText)

    for (var i = 0; i < tasks.length; i++) {
        addTaskToList(tasks[i])
    }

    http.open("GET", url)
    http.send()
}

function addTask() {
    var taskName = document.getElementById("task").value
    http.open("POST", url)
    http.setRequestHeader('Content-Type', 'application/json')

    http.onreadystatechange = function () {
        if (this.readyState !== 4 || this.status !== 200) {
            return;
        }

        addTaskToList(taskName)
        document.getElementById("form").reset()
    }
    http.send(JSON.stringify(task))
}

function addTaskToList(task) {
    var tasksList = document.getElementById("tasks")
    var li = document.createElement("li")
    var text = document.createTextNode(task)

    li.appendChild(text)
    tasksList.appendChild(li)
}