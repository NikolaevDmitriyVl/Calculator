package practice.Shildt;

 class Help {
     void helpon(int what) {
         switch (what) {
             case '1':
                 System.out.println("operator if:\n");
                 System.out.println("if(uslovie) operator;");
                 System.out.println("else operator;");
                 break;
             case '2':
                 System.out.println("operator switch:\n");
                 System.out.println("switch(virazenie) (");
                 System.out.println("   case konstanta:");
                 System.out.println("    posledovatelnost operatorov");
                 System.out.println("break;");
                 System.out.println("   // ...");
                 System.out.println("}");
                 break;
             case '3':
                 System.out.println("operator for:\n");
                 System.out.println("for (inicializaciya; uslovie; iteraciya)");
                 System.out.println(" operator;");
                 break;
             case '4':
                 System.out.println("operator do-while:\n");
                 System.out.println("do {");
                 System.out.println(" operator;");
                 System.out.println("} while (uslovie;");
                 break;
             case '7':
                 System.out.println("operator continue:\n");
                 System.out.println("continue; ili continue metka;");
                 break;
         }
         System.out.println();
     }

     void showmenu() {
         System.out.println("spravka:");
         System.out.println("  1. if");
         System.out.println(" 2.switch");
         System.out.println(" 3. for");
         System.out.println(" 4. while");
         System.out.println(" 5. do-while");
         System.out.println(" 6. break");
         System.out.println(" 7. continue\n");
         System.out.println("viberite (q - vihod): ");
     }

     boolean isvalid(int ch) {
         if (ch < '1' | ch > '7' & ch != 'q') return false;
         else return true;
     }

     class Help1 {
         void helpon(int what) {
             switch (what) {
                 case '1':
                     System.out.println("operator if:\n");
                     System.out.println("if(uslovie) operator;");
                     System.out.println("else operator;");
                     break;
                 case '2':
                     System.out.println("operator switch:\n");
                     System.out.println("switch(virazenie) {");
                     System.out.println(" case konstanta:");
                     System.out.println(" posledovatelnost operatorov");
                     System.out.println(" break;");
                     System.out.println(" // ...");
                     System.out.println("}");
                     break;
                 case '3':
                     System.out.println("operator for:\n");
                     System.out.println("for(inicializaciya; uslovie; iteraciya");
                     System.out.println(" operator;");
                     break;
                 case '4':
                     System.out.println("operator while:\n");
                     System.out.println("while(uslovie) operator;");
                     break;
                 case '5':
                     System.out.println("operator do-while:\n");
                     System.out.println("do {");
                     System.out.println(" operator;");
                     System.out.println("} while (uslovie;");
                     break;
                 case '6':
                     System.out.println("operator break:\n");
                     System.out.println("break; ili break metka;");
                     break;
                 case '7':
                     System.out.println("operator continue:\n");
                     System.out.println("continue; ili continue metka;");
                     break;
             }
             System.out.println();
         }

         void showmenu() {
             System.out.println("spravka:");
             System.out.println(" 1. if");
             System.out.println(" 2. switch");
             System.out.println(" 3. for");
             System.out.println(" 4. while");
             System.out.println(" 5. do-while");
             System.out.println(" 6. break");
             System.out.println(" 7. continue\n");
             System.out.println(" viberite (q - vihod):");
         }

         boolean isvalid(int ch) {
             if (ch < '1' | ch > '7' & ch != 'q') return false;
             else return true;
         }

     }

     class Help2 {
         void helpon(int what) {
             switch (what) {
                 case '1':
                     System.out.println("operator if:\n");
                     System.out.println("if(uslovie) operator;");
                     System.out.println("else operator");
                     break;
                 case '2':
                     System.out.println("operator switch:\n");
                     System.out.println("switch(virazenie) {");
                     System.out.println("  case konstanta:");
                     System.out.println(" posledovatelnost operatorov");
                     System.out.println(" break;");
                     System.out.println(" // ...");
                     System.out.println("}");
                     break;
                 case '3':
                     System.out.println("operator for:\n");
                     System.out.println("for(inicializaciya; uslovie; iteraciya)");
                     System.out.println(" operator;");
                     break;
                 case '4':
                     System.out.println("operator while:\n");
                     System.out.println("while(uslovie) operator;");
                     break;
                 case '5':
                     System.out.println("operator do-while:\n");
                     System.out.println("do {");
                     System.out.println(" operator;");
                     System.out.println("} while (uslovie;");
                     break;
                 case '6':
                     System.out.println("operator continue:\n");
                     System.out.println("break; ili break metka;");
                     break;
                 case '7':
                     System.out.println("operator continue:\n");
                     System.out.println("continue; ili continue metra;");
                     break;
             }
             System.out.println();
         }

         void showmenu() {
             System.out.println("spravka:");
             System.out.println(" 1.if");
             System.out.println(" 2.switch");
             System.out.println(" 3. for");
             System.out.println(" 4. while");
             System.out.println(" 5. do-while");
             System.out.println(" 6. break");
             System.out.println(" 7. continue\n");
             System.out.println("viberite (q - vihod): ");
         }

         boolean isvalid(int ch) {
             if (ch < '1' | ch > '7' & ch != 'q') return false;
             else return true;
         }
     }

         class HelpClassDemo {
             public void main(String[] args)
                     throws java.io.IOException {
                 char choice, ignore;
                 Help hlpobj = new Help();

                 for (; ; ) {
                     do {
                         hlpobj.showmenu();
                         choice = (char) System.in.read();
                         do {
                             ignore = (char) System.in.read();
                         } while (ignore != '\n');
                     } while (!hlpobj.isvalid(choice));

                     if (choice == 'q') break;
                     System.out.println("\n");
                     hlpobj.helpon(choice);
                 }
             }
         }
     }


