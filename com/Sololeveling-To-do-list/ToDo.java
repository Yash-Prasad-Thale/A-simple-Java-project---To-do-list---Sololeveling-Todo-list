//Commments:


//Code:
class ToDo{
    String Task;
    SubToDo[] SubToDos;

    ToDo(String Task){
        this.Task = Task;
    }

    public void AddSubTodo(String Task){
        SubToDos.append(new SubToDo(Task));
    }

    public void MarkAsDone(){
        
    }
}