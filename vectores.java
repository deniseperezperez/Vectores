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

             } else if( op == 3){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                

                sum1 = i1 + i2 + i3;
                sum2 = j1 + j2 + j3;
                
                res1 = i1 - i2 - i3;
                res2 = j1 - j2 - j3;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");

             } else if( op == 4){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();

                

                sum1 = i1 + i2 + i3 + i4;
                sum2 = j1 + j2 + j3 +j4;
                
                res1 = i1 - i2 - i3 - i4;
                res2 = j1 - j2 - j3 - j4;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");

             } else if( op == 5){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector y");
                 System.out.println("Ingresa el valor de i");
                i5 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j5 = lectura.nextInt();


                

                sum1 = i1 + i2 + i3 + i4 +i5;
                sum2 = j1 + j2 + j3 +j4+ j5;
                
                res1 = i1 - i2 - i3 - i4 - i5;
                res2 = j1 - j2 - j3 - j4 -j5;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");
                
               }else if( op == 6){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector y");
                 System.out.println("Ingresa el valor de i");
                i5 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j5 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector z");
                 System.out.println("Ingresa el valor de i");
                i6 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j6 = lectura.nextInt();


                

                sum1 = i1 + i2 + i3 + i4 +i5 + i6;
                sum2 = j1 + j2 + j3 +j4+ j5 + j6;
                
                res1 = i1 - i2 - i3 - i4 - i5 - i6;
                res2 = j1 - j2 - j3 - j4 -j5 - j6;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");
                
               } else if( op == 7){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector y");
                 System.out.println("Ingresa el valor de i");
                i5 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j5 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector z");
                 System.out.println("Ingresa el valor de i");
                i6 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j6 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector a");
                 System.out.println("Ingresa el valor de i");
                i7 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j7 = lectura.nextInt();


                sum1 = i1 + i2 + i3 + i4 +i5 + i6 + i7 ;
                sum2 = j1 + j2 + j3 +j4+ j5 + j6 + j7 ;
                
                res1 = i1 - i2 - i3 - i4 - i5 - i6 - i7 ;
                res2 = j1 - j2 - j3 - j4 -j5 - j6 - j7 ;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");
                
               } else if( op == 8){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector y");
                 System.out.println("Ingresa el valor de i");
                i5 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j5 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector z");
                 System.out.println("Ingresa el valor de i");
                i6 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j6 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector a");
                 System.out.println("Ingresa el valor de i");
                i7 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j7 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector b");
                 System.out.println("Ingresa el valor de i");
                i8 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j8 = lectura.nextInt();



                sum1 = i1 + i2 + i3 + i4 +i5 + i6 + i7 + i8 ;
                sum2 = j1 + j2 + j3 +j4+ j5 + j6 + j7 + j8;
                
                res1 = i1 - i2 - i3 - i4 - i5 - i6 - i7- i8 ;
                res2 = j1 - j2 - j3 - j4 -j5 - j6 - j7 - j8;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");
                
               } else if( op == 9){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector y");
                 System.out.println("Ingresa el valor de i");
                i5 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j5 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector z");
                 System.out.println("Ingresa el valor de i");
                i6 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j6 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector a");
                 System.out.println("Ingresa el valor de i");
                i7 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j7 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector b");
                 System.out.println("Ingresa el valor de i");
                i8 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j8 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector c");
                 System.out.println("Ingresa el valor de i");
                i9 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j9 = lectura.nextInt();




                sum1 = i1 + i2 + i3 + i4 +i5 + i6 + i7 + i8 +  i9;
                sum2 = j1 + j2 + j3 +j4+ j5 + j6 + j7 + j8 +  j9;
                
                res1 = i1 - i2 - i3 - i4 - i5 - i6 - i7- i8 - i9;
                res2 = j1 - j2 - j3 - j4 -j5 - j6 - j7 - j8 -  j9;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");
                
               } else if( op == 10){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector y");
                 System.out.println("Ingresa el valor de i");
                i5 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j5 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector z");
                 System.out.println("Ingresa el valor de i");
                i6 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j6 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector a");
                 System.out.println("Ingresa el valor de i");
                i7 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j7 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector b");
                 System.out.println("Ingresa el valor de i");
                i8 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j8 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector c");
                 System.out.println("Ingresa el valor de i");
                i9 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j9 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector d");
                 System.out.println("Ingresa el valor de i");
                i10 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j10 = lectura.nextInt();





                sum1 = i1 + i2 + i3 + i4 +i5 + i6 + i7 + i8 +  i9 + i10;
                sum2 = j1 + j2 + j3 +j4+ j5 + j6 + j7 + j8 +  j9 + j10;
                
                res1 = i1 - i2 - i3 - i4 - i5 - i6 - i7- i8 - i9 - i10;
                res2 = j1 - j2 - j3 - j4 -j5 - j6 - j7 - j8 -  j9 - j10;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");
                
               } else if( op == 11){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector y");
                 System.out.println("Ingresa el valor de i");
                i5 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j5 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector z");
                 System.out.println("Ingresa el valor de i");
                i6 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j6 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector a");
                 System.out.println("Ingresa el valor de i");
                i7 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j7 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector b");
                 System.out.println("Ingresa el valor de i");
                i8 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j8 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector c");
                 System.out.println("Ingresa el valor de i");
                i9 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j9 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector d");
                 System.out.println("Ingresa el valor de i");
                i10 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j10 = lectura.nextInt();


               System.out.println("Ingresa los valoress del vector e");
                 System.out.println("Ingresa el valor de i");
                i11 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j11 = lectura.nextInt();



                sum1 = i1 + i2 + i3 + i4 +i5 + i6 + i7 + i8 +  i9 + i10 + i11;
                sum2 = j1 + j2 + j3 +j4+ j5 + j6 + j7 + j8 +  j9 + j10 + j11;
                
                res1 = i1 - i2 - i3 - i4 - i5 - i6 - i7- i8 - i9 - i10 - i11; 
                res2 = j1 - j2 - j3 - j4 -j5 - j6 - j7 - j8 -  j9 - j10 - j11;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");
                
               } else if( op == 12){
           
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
                
                System.out.println("Ingresa los valoress del vector w");
                 System.out.println("Ingresa el valor de i");
                i3 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j3 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector x");
                 System.out.println("Ingresa el valor de i");
                i4 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j4 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector y");
                 System.out.println("Ingresa el valor de i");
                i5 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j5 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector z");
                 System.out.println("Ingresa el valor de i");
                i6 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j6 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector a");
                 System.out.println("Ingresa el valor de i");
                i7 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j7 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector b");
                 System.out.println("Ingresa el valor de i");
                i8 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j8 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector c");
                 System.out.println("Ingresa el valor de i");
                i9 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j9 = lectura.nextInt();
                
                 System.out.println("Ingresa los valoress del vector d");
                 System.out.println("Ingresa el valor de i");
                i10 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j10 = lectura.nextInt();


               System.out.println("Ingresa los valoress del vector e");
                 System.out.println("Ingresa el valor de i");
                i11 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j11 = lectura.nextInt();
                
                System.out.println("Ingresa los valoress del vector f");
                 System.out.println("Ingresa el valor de i");
                i12 = lectura.nextInt();
                
                System.out.println("Ingresa el valor de j");
                j12 = lectura.nextInt();



                sum1 = i1 + i2 + i3 + i4 +i5 + i6 + i7 + i8 +  i9 + i10 + i11 + i12;
                sum2 = j1 + j2 + j3 +j4+ j5 + j6 + j7 + j8 +  j9 + j10 + j11 + j12;
                
                res1 = i1 - i2 - i3 - i4 - i5 - i6 - i7- i8 - i9 - i10 - i11 - i12; 
                res2 = j1 - j2 - j3 - j4 -j5 - j6 - j7 - j8 -  j9 - j10 - j11 - j12;
                
                System.out.println("El resultado de la suma es: " + sum1 "i," + sum2 "j");

                System.out.println("El resultado de la resta es: " + res1 "i," + res2 "j");
                
               }  } else if (op != 12) {
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
       
    }
  }