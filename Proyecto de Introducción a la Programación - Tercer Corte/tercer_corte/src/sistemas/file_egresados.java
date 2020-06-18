package sistemas;
/*Author: Juan Ricardo Torres Céspedes
	  Date: 18/06/2020
	  Description: This software determines the graduates profile (name, identification card, faculty and graduation year.
	 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_egresados {
    public static boolean file_egresados (String p_faculty, String p_name, String p_ID, String p_graduation_date) {
        boolean result;
        try {
            File myFile = new File("C:/Users/Usuario/Documents/Egresados.txt");
            if (myFile.exists()) {
                FileWriter myFile2 = new FileWriter(myFile, true);
                BufferedWriter dataMyFile = new BufferedWriter(myFile2);
                dataMyFile.write("\n" +p_ID+ "|" + p_name + "|"  + p_faculty +  "|" + p_graduation_date);
                dataMyFile.close();
                result = true;
            } else {
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static String[][] f_all_data_proyecto () {
        String[][] matrix_project;
        String linea_texto, linea_tmp, linea_tmp1, linea_tmp2;
        int row = 0, total_lines = 0, separador1, separador2, separador3;
        try {
            File myfile = new File("C:/Users/Usuario/Documents/Egresados.txt");
            if (myfile.exists()) {
                Scanner myfile3 = new Scanner(myfile);
                while (myfile3.hasNextLine()) {
                    total_lines++;
                    myfile3.nextLine();
                }
                myfile3.close();
                matrix_project = new String[total_lines][4];
                myfile3 = new Scanner(myfile);
                while (myfile3.hasNextLine()) {
                    linea_texto = myfile3.nextLine();
                    separador1 = linea_texto.indexOf("|");
                    if (separador1 != -1) {
                        matrix_project[row][0] = linea_texto.substring(0, separador1);
                        linea_tmp = linea_texto.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_project[row][1] = linea_tmp.substring(0, separador2);
                        linea_tmp1 = linea_tmp.substring(separador2 + 1);
                        separador3 = linea_tmp1.indexOf("|");
                        matrix_project[row][2] = linea_tmp1.substring(0, separador3);
                        linea_tmp2 = linea_tmp1.substring(separador3 + 1);
                        matrix_project[row][3] = linea_tmp2;
                        row++;
                    }
                }
                myfile3.close();
                return matrix_project;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
