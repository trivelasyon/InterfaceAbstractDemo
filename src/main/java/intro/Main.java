package intro;

public class Main {
            public static void main (String [] args){
                //CamelCase
                //Dont repeat yourself
                String internetSubeButonu = "İnternet Subesi";
                double dolarDun=8.15;
                double dolarBugun=8.24;
                int vade=36;
                boolean dustuMu=true;
                System.out.println(internetSubeButonu);

                if (dolarBugun<dolarDun){
                 System.out.println("dolar düştü");
                }
                else{
                    System.out.println("dolar yükseldi");
                }

                String [] krediler =
                        {
                                "Hizli Kredi",
                                "Arti Kredi",
                                "Çiftçi Kredi"
                        };
               //Foreach c#'ta
                for(String kredi : krediler){
                    System.out.println(kredi);
                }
            }

}
