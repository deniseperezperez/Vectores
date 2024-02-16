import java.util.Scanner;

public class vectores {
    public static void main(String[] args) {
    int u, v, w, x, y, z, a, b, c, d, e, f, i1, j1, k1, i2, j2, k2, i3, j3, k3, i4, j4, k4, i5, j5, k5, i6, j6, k6, i7, j7, k7, i8, j8,
     k8, i9, j9, k9, i10, j10, k10, i11, j11, k11, i12 , j12, k12, sum1, sum2, sum3, res1, res2, res3, op;
     
      Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa el numero de vectores que necesitas (maximo 12, minimo 2)");
        op = lectura.nextInt();
        
        if( op==2){
           
                System.out.println("Ingresa los valores del vector U");
                System.out.println("Ingresa el valor de I");
                i1 = lectura.nextInt();

                System.out.println("Ingresa el valor de j");
                j1 = lectura.nextInt();

              
                System.out.println("Ingresa los valoress del vector V");
                 System.out.println("Ingresa el valor de i");
                i2 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j2 = lectura.nextInt();
                
                sum1 = i1 + i2;
                sum2 = j1 + j2;
                
                res1 = i1 - i2;
                res2 = j1 - j2;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");

             } 


                        

       
    }
  }