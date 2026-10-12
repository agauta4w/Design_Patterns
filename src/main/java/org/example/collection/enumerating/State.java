package org.example.collection.enumerating;

public enum State {

    BIHAR(1, "My BirthPlace"),
    TELANGANA(2, "My Workplace"),
    ANDHRAPRADESH(3, "First jyothirlingas Visit");

    private int value;
    private String comment;

    State(int value, String comment){
        this.value = value;
        this.comment = comment;
    }

    public int getValue(){
        return value;
    }

    public String getComment(){
        return comment;
    }

    public  static State getValue(int value){
        for (State state : State.values()){
            if(state.getValue() == value){
                return state;
            }
        }
        return null;
    }

}
