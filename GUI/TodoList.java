import java.util.ArrayList;

public class TodoList {

  private ArrayList<Task> theList;

  public static void main(String[] args)
  {

    TodoList myList = new TodoList();

    myList.add("get dressed");
    myList.add("brush teeth");
    myList.add("...ehm...");
    myList.add("shower");
    myList.add("eat");
    myList.add("drink");
    myList.add("buy ticket");

    myList.done("brush teeth");
    myList.done("shower");

    myList.todolistAusgeben();

  }

  public TodoList()
  {
    theList = new ArrayList<Task>();
  }

  public void add(String activity)
  {
    theList.add(new Task(activity));
  }

  public Task get(String activity)
  {
    for (Task task : theList)
      if (task.isCalled(activity))
        return task;

    return null;
  }

  public void done(String activity)
  {
    Task task = get(activity);

    if (task != null)
      task.done();
  }

  public void todolistAusgeben()
  {
    int sizeOfList = theList.size();
    for (int i=0; i < sizeOfList; i++) {
      Task sTodo = theList.get(i);
      System.out.println(sTodo);
    }
  }

   private class Task {

    private String name;
    private boolean status;

    public Task(String name)
    {
      this.name = name;
      this.status = false;
    }

    public boolean isCalled(String name)
    {
      return this.name.equals(name);
    }

    public void done()
    {
      status = true;
    }

    public String toString()
    {
      return name + " : " + (status ? "DONE" : "Waiting...");
    }

  }

} 