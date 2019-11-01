public class TreeArray{
    static int tree[] = new int[10];
    static int root = 0;
    public static void main(String[] args){
        for(int i=0;i<tree.length;i++){
            tree[i] = -1;
        }
        init(5);
        setLeft(4,0);
        setRight(6,0);
        for(int i=0;i<tree.length;i++)
        {
            if(tree[i] == -1)
            {
                System.out.print("-");
            }else{
                System.out.print(tree[i] + " ");
            }
        }
    }

    static void init(int value){
        tree[root] = value;
    }

    static void setLeft(int value,int root){
        if(tree[root] == -1)
        {
            System.out.println("Cannot set value of the number who is not having root element");
            return ;
        }
        int index = 2*root+1;
        tree[index] = value;
    }
    static void setRight(int value,int root){
        if(tree[root] == -1)
        {
            System.out.println("Cannot set value of the number who is not having root element");
            return ;
        }
        int index = 2*root+2;
        tree[index] = value;
    }
}