package Interface;

public class Store {
    Member members[]=new Member[10];
    int count=0;

    void register(Member m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callBack();
    }

}

