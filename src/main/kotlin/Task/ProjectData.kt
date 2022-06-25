package Task

class ProjectData(val projectURLPart : String) {
    var projectEpics = ArrayList<EpicTaskData>()
    var projectTasks = ArrayList<TaskData>()
}