import java.time.LocalDate;

public class Sms {
    static int ITcount = 0;
    static int CSEcount = 0;
    static int ECEcount = 0;
    static int MECHcount = 0;
    static int CHEMcount = 0;
    static int TEXTcount = 0;

    String name, email, branch, regNo, str;
    int adm_yr;
    String[] info;

    Sms(String name, String branch, int adm_yr) {
        this.name = name;
        this.branch = branch;
        this.adm_yr = adm_yr;

        if (branch.toLowerCase().equals("it")) {
            ITcount++;
            str = branch.substring(0, 2);

            if (ITcount < 10) {
                this.regNo = "" + adm_yr + "b" + str + "00" + ITcount;
                this.email = "" + regNo + "@sggs.ac.in";
            } else {
                this.regNo = "" + adm_yr + "b" + str + "0" + ITcount;
                this.email = "" + regNo + "@sggs.ac.in";
            }
        }

        if (branch.toLowerCase().equals("cse")) {
            CSEcount++;
            str = branch.substring(0, 2);

            if (CSEcount < 10) {
                this.regNo = "" + adm_yr + "b" + str + "00" + CSEcount;
                this.email = "" + regNo + "@sggs.ac.in";
            } else {
                this.regNo = "" + adm_yr + "b" + str + "0" + CSEcount;
                this.email = "" + regNo + "@sggs.ac.in";
            }
        }

        if (branch.toLowerCase().equals("ece")) {
            ECEcount++;
            str = branch.substring(0, 2);

            if (ECEcount < 10) {
                this.regNo = "" + adm_yr + "b" + str + "00" + ECEcount;
                this.email = "" + regNo + "@sggs.ac.in";
            } else {
                this.regNo = "" + adm_yr + "b" + str + "0" + ECEcount;
                this.email = "" + regNo + "@sggs.ac.in";
            }
        }

        if (branch.toLowerCase().equals("mech")) {
            MECHcount++;
            str = branch.substring(0, 2);

            if (MECHcount < 10) {
                this.regNo = "" + adm_yr + "b" + str + "00" + MECHcount;
                this.email = "" + regNo + "@sggs.ac.in";
            } else {
                this.regNo = "" + adm_yr + "b" + str + "0" + MECHcount;
                this.email = "" + regNo + "@sggs.ac.in";
            }
        }

        if (branch.toLowerCase().equals("chem")) {
            CHEMcount++;
            str = branch.substring(0, 2);

            if (CHEMcount < 10) {
                this.regNo = "" + adm_yr + "b" + str + "00" + CHEMcount;
                this.email = "" + regNo + "@sggs.ac.in";
            } else {
                this.regNo = "" + adm_yr + "b" + str + "0" + CHEMcount;
                this.email = "" + regNo + "@sggs.ac.in";
            }
        }

        if (branch.toLowerCase().equals("text")) {
            TEXTcount++;
            str = branch.substring(0, 2);

            if (TEXTcount < 10) {
                this.regNo = "" + adm_yr + "b" + str + "00" + TEXTcount;
                this.email = "" + regNo + "@sggs.ac.in";
            } else {
                this.regNo = "" + adm_yr + "b" + str + "0" + TEXTcount;
                this.email = "" + regNo + "@sggs.ac.in";
            }
        }

        
        System.out.println("\nName: " + this.name);
        System.out.println("Branch: " + this.branch);

        int currentYear = LocalDate.now().getYear();
        int yearOfStudy = currentYear - adm_yr + 1;

        if (yearOfStudy >= 4) {
            System.out.println("Current Status: Pass Out");
        } else {
            System.out.println("Year of Study: " + yearOfStudy);
        }

        System.out.println("Registration no. : " + this.regNo);
        System.out.println("Email : " + this.email);
    }

    public static void main(String[] args) {
        Sms s1 = new Sms("Nishikant", "it", 2023);
        Sms s2 = new Sms("Sangh", "ece", 2023);
        Sms s3 = new Sms("Nobal", "it", 2019);
    }
}

