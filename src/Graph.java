import java.util.ArrayList;

/**
 * @author  Anton Zotov
 * @see     ArrayList
 *
 */
class Graph{
    /**
     * Graph name
     */
    private String name;
    /**
     * List of graph dependencies
     */
    public ArrayList<Graph> childName = new ArrayList<>();

    /**
     * Class Constructor
     * @see Graph#Graph(String)
     */
    Graph(){};

    /**
     * Class Constructor specifying name of graph
     * @param name name of the head element of the graph
     * @see Graph#Graph()
     */
    Graph(String name){
        this.name = name;
    }

    /**
     * Set name of the head element of the graph
     * @param name name of the head element of the graph
     */
    public void add(String name){
        childName.add(new Graph(name));
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    public Graph get(int index){
        return childName.get(index);
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size(){
        return childName.size();
    }

    /**
     * Returns the name of Graph
     *
     * @return the name of Graph
     */
    public String getName(){
        return name;
    }

    private String GetAllElem(){
        String Elem ="";
        if(childName.size()!=0) {
            for (int i = 0; i < childName.size(); i++) {
                Elem += "'" + childName.get(i).getName() + "'";
                if (i + 1 < childName.size()) {
                    Elem += ",";
                }
            }
        }
        return Elem;
    }

    private String GetNextChildElem(){
        String Elem ="";
        if(childName.size()!=0){
            for (int i =0;i<childName.size();i++) {
                Elem +=",";
                Elem += childName.get(i).toString();
            }
        }
        return Elem;
    }

    /**
     *
     * @return
     */
    public Boolean Contains(){

        return false;
    }



    /**
     *
     * @return all elements Graph
     */
    @Override
    public String toString() {
        return "'" + name +"': ["+GetAllElem()+"]"+GetNextChildElem() ;
    }
}