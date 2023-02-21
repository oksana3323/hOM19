public enum Planet {
    MARS("Марс жер планетасына окшош"),
    JUPITER("Юпитер күн системасындагы эң чоң планета"),
    VENUS("Beнера жерге окшош планетасына кирет "),
    MERCURY("Меркурийин усту сокку кратерлери менен капталган айга окшош.");



    private String county;

    Planet(String county) {
        this.county = county;
    }

    public String getCounty() {
        return county;
    }
}

