public class InterestRate {

    static String findInterestRate(boolean isCompany, int month) {

        if (isCompany) {
            if (month < 1) {
                return "invalid";
            } else if (month <= 2) {
                return "2.7%";
            } else if (month <= 5) {
                return "3.5%";
            } else if (month <= 11) {
                return "4.4%";
            } else {
                return "5.2%";
            }
        } else {
            if (month < 1) {
                return "invalid";
            } else if (month <= 2) {
                return "3%";
            } else if (month <= 5) {
                return "3.5%";
            } else if (month <= 11) {
                return "4.5%";
            } else {
                return "5.5%";
            }
        }
    }
}
