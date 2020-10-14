public class App {
    public static void main(String[] args) throws Exception {
//ex 1
   /* int max=0, min=9999;
      // int n= 10;
       int f[]={1,5,6,3,8,10,21,2,51,32};  
         //int f[]= new int [n];
        // cum initializez un vector cu n elemente?    
        
        for (int i : f) 
        {          
           if(i>max)
            max=i;  
            if(i<min)
            min=i; }
        System.out.println(max);
        System.out.println(min);   */

//ex 2
/*
int i;
int n = 10;
int f[] = new int[n];
 f[0]=1; f[1]=1;
 for ( i = 2; i < n; i++)  
  { f[i]=f[i-2]+f[i-1];
     
 }
 for(i=0; i<n; i++)
 System.out.println(f[i]);*/

// ex 3
 
 /*
int i,j,max=0,min=99999;
int m[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

for(i=0;i<m.length;i++)
{    System.out.println("\n");
    for(j=0;j<m[0].length;j++)
        System.out.print(m[i][j]+" ");
}

        
for(i=0;i<m.length;i++){
    for(j=0;j<m[0].length;j++){
        if(m[i][j]>max)
        max=m[i][j];  
        if(m[i][j]<min)
        min=m[i][j];
    }
            
    }
            
            System.out.println(max);
            System.out.println(min);
         
*/

//ex 4
/* int i,j;
 int m[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}},v[][] = {{10,23,32,14},{15,16,17,28},{19,10,22,42}},c[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0}};
for(i=0;i<m.length;i++){
    System.out.println("\n");
   for(j=0;j<m[0].length;j++)
       System.out.println(m[i][j]+" ");}

 for(i=0;i<v.length;i++){
    System.out.println("\n");
     for(j=0;j<v[0].length;j++)
        System.out.println(v[i][j]+" ");}

        for(i=0;i<v.length;i++){
            System.out.println("\n");
             for(j=0;j<v[0].length;j++)
            c[i][j]=m[i][j]+v[i][j];}

            for(i=0;i<m.length;i++)
            {System.out.println("\n");
               for(j=0;j<m[0].length;j++)
                   System.out.print(c[i][j]+" ");}  
                   */
                  
 //ex 5
 /*   int i,j;
 int m[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}},v[][] = {{10,23,32,14},{15,16,17,28},{19,10,22,42}},c[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0}};
for(i=0;i<m.length;i++){
    System.out.println("\n");
for(j=0;j<m[0].length;j++)
    System.out.print(m[i][j]+" ");}

for(i=0;i<v.length;i++){
    System.out.println("\n");
    for(j=0;j<v[0].length;j++)
        System.out.print(v[i][j]+" ");}

    for(i=0;i<m.length;i++){
        System.out.println("\n");
        for(j=0;j<v[0].length;j++)
            for(int k=0;k<v.length;k++)
                c[i][j]+= m[i][k] * v[k][j];
    }

    for(i=0;i<c[0].length;i++){
        System.out.println("\n");
        for(j=0;j<c[0].length;j++)
            System.out.print(c[i][j]+" "); */
    } 
    }

