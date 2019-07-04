package sqlattach;

public class queries {

    jdbcconnection db = new jdbcconnection();
    String query;

    public queries(){

    }

    public void insert(String name,int salary){
        query="insert into person (name,salary) values ('"+name+"',"+salary+");";
        System.out.println(query);
        db.dbquery(query,0);
    }

    public void printall(){
        query="select * from person;";
        db.dbquery(query,1);
    }

    public void printonly(){
        query="select * from person where salary>10000;";
        db.dbquery(query,1);
    }

    public void updaterichfellows(){
        query="update person set name='Rich Fellows' where salary>10000;";
        db.dbquery(query,0);
    }

    public void deleterichfellows(){
        query="delete from person where salary>10000;";
        db.dbquery(query,0);
    }
}
