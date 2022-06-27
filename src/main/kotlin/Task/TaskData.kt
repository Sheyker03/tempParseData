package Task

import java.util.Arrays

class TaskData(
    val taskName : String,
    val taskDescription : String? = null,
    val taskManagerH : String,
    val taskResponsibleH : String? = null,
    val taskCoExecutorsH : ArrayList<String>? = null,
    val taskObserver: String? = null,
    val taskStatementTime : String,
    val taskEpic: EpicTaskData? = null, // todo Возможно стоит string-ом
    var taskTags: ArrayList<String>? = null,
    var taskRelated : ArrayList<TaskData>? = null,
    var taskComment : ArrayList<CommentTask>? = null
    ) {



}
