package enumPack;

public enum Region {
    SOUTH_EAST("Agbado", "Ijebu", "Egba"),
    SOUTH_SOUTH("Sabo", "Ilasa", "Jibowu"),
    NORTH_NORTH("Ketu", "Awoyaya", "Ojota");

    private final String[] states;

    Region(String... states){
        this.states = states;
    }

    public String[] getStates(){
        return states;
    }
}
