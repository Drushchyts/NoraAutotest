package webNora.automation.core.utils;


public enum PauseLenght {
    MAX(10),
    MIN(5),
    AJAX(10),
    AVG(30);
    private Integer value;
    PauseLenght(Integer value){
        this.value = value;
    }
    public Integer value(){
        return this.value;
    }
}
