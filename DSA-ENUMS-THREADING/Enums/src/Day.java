public enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    //Do You Always Need a Constructor in Enums?
    //❌ No. If your enum only needs names (without extra values), you don’t need a constructor
    private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }
}
