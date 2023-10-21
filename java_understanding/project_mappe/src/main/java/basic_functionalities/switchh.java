package basic_functionalities;

public class switchh {
    public void switcH() {
        int dayOfWeek = 4; // Lad os sige, at 4 repræsenterer onsdag

        switch (dayOfWeek) {
            case 1:
                System.out.println("Mandag");
                break;
            case 2:
                System.out.println("Tirsdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lørdag");
                break;
            case 7:
                System.out.println("Søndag");
                break;
            default:
                System.out.println("Ugyldigt nummer for en ugedag");
        }
    }
}
