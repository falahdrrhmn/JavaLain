<div align = "center">
  <h1> Java Lain </h1>
</div>

<div align = "center">
  <h2> Looping Bersarang </h2>
</div>

```java
package JavaBasic;

public class LoopingBersarang {
    public static void main(String[] args) {
        //  kotak 1
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
        
        System.out.println("\n");
        
        // segitiga siku-siku
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
                if (i == j){
                    break;
                }
            }
            System.out.println("\n");
        }
        
        System.out.println("\n");

        // segitiga siku-siku
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
                if(i + j == 4){
                    break;
                }
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        // segitiga
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
                if (i == j){
                    break;
                } else if (i + j ==8 ){
                    break;

                }
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        // segitiga
        
        int n = 5;
        for (int i = 0; i < n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = n - i; j > 1; j--) {
                // printing spaces
                System.out.print(" ");
            }

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
        
    }
}

```

output

```java 
 *  *  *  *  * 

 *  *  *  *  * 

 *  *  *  *  * 

 *  *  *  *  *

 *  *  *  *  *



 *

 *  *

 *  *  *

 *  *  *  * 

 *  *  *  *  *



 *  *  *  *  *

 *  *  *  *

 *  *  *

 *  *

 *



 * 

 *  *

 *  *  *

 *  *  *  *

 *  *  *  *  *

 *  *  *  *

 *  *  *

 *  * 

 *



    *
   * *
  * * *
 * * * *
* * * * *
```




<br><br><br>

<div align = "center">
  <h2> Diamond Alphabet Pattern </h2>
</div>

Cara bikin kayak gini 


Maka perlu bikin bagian atas 

```java
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
```

dan bagian bawah kayak gini 

```java
ABCDEFG
  ABCDE
   ABC
    A
```

agak garapih bagian bawahnya, intinya hasil akhirnya kayak gini

```java
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
```

source codenya gini

```java
public class DiamondAlpha {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        // bagian atas pyramid 
        for (int i = 1; i <= size; i++){

            // print space 
            for (int j = size; j > i; j--){
                System.out.print(" ");
            }

            // print alphabet
            for (int k = 0; k < i * 2 - 1; k++){
                System.out.print((char)(alpha + k));
            }

            System.out.println();

        }

        // bagian bawah pyramid 
        for (int i = 1; i <= size - 1; i++){

            // print space
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            // print alphabet
            for(int k = 0; k < (size - i) * 2 - 1; k++ ){
                System.out.print((char)(alpha+k));
            }
            System.out.println();
        }

    }
}

```

<div align="center">
  <a href="https://github.com/falahdrrhmn/Tutorial-Java/blob/main/README.md">(Basic Java)</a>
</div>

<br>
<br>

<div align="center">
    Follow me!<br>
    <a href="https://bit.ly/3Qcg3s4">LinkedIn</a>
    ??
    <a href="https://bit.ly/3oRMMaA">Instagram</a>
    ??
    <a href="https://bit.ly/3zqrTrP">Youtube</a>
</div>
