 package modul2;
public class nomer2 {
    public static void main(String[] args) {
        int[][] matriks_a = {
            {11,12},
            {13,14},
            {15,16}
        };
        int[][] matriks_b = {
            {1,2},
            {3,4},
            {5,6}
        };
        int[][] hasilTambah = new int[matriks_a.length][matriks_a[0].length];
        if (matriks_a.length == matriks_b.length && matriks_a[0].length == matriks_b[0].length){
            for (int i=0; i<matriks_a.length; i++){
                for (int j=0; j<matriks_a[0].length; j++){
                hasilTambah[i][j] = matriks_a[i][j] - matriks_b[i][j];
                System.out.print(hasilTambah[i][j]+" ");
                }
            System.out.println();
            }
        }
        else{
            System.out.print("\n baris dan kolom matriks tidak sama");
        }
    }
}
//Bachtiar Dwi Rizqianthoro_20090122_2A