package todo;
import  java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int opcion =0;
            ArrayList<Disco> discos = new ArrayList<Disco>();

            while(opcion!=5) {
                System.out.println("-----------------------------");
                System.out.println("--Menu Principal--");
                System.out.println("1-Anadir disco a colecion");
                System.out.println("2-Modificar disco");
                System.out.println("3-Eliminar disco");
                System.out.println("4-Mostrar disco");
                System.out.println("5-Salir");
                System.out.println("-----------------------------");
                System.out.println("Escoge una opcion");

                opcion = Integer.parseInt(br.readLine());
                System.out.println("-----------------------------");

                switch (opcion) {
                    case 1:
                        System.out.println("1-Anadir disco a colecion");
                        System.out.println("-----------------------------");
                        Disco nuevo = new Disco();

                        System.out.println("Titulo?");
                        String titulo = br.readLine();
                        System.out.println("Grupo?");
                        String grupo = br.readLine();
                        System.out.println("Numero de temas?");
                        int temas = Integer.parseInt(br.readLine());
                        System.out.println("Duracion?");
                        double duracion =  Double.parseDouble(br.readLine());

                        nuevo.setTitulo(titulo);
                        nuevo.setGrupo(grupo);
                        nuevo.setTemas(temas);
                        nuevo.setDuracion(duracion);
                        discos.add(nuevo);

                        System.out.println("-----------------------------");
                        System.out.println("Resumen");
                        System.out.println("Titulo: "+titulo);
                        System.out.println("Grupo: "+grupo);
                        System.out.println("Numero de temas: "+temas);
                        System.out.println("Duracion: "+duracion);
                        break;
                    case 2:
                        System.out.println("2-Modificar disco");
                        System.out.println("-----------------------------");
                        break;
                    case 3:
                        System.out.println("3-Eliminar disco");
                        System.out.println("-----------------------------");
                        break;
                    case 4:
                        System.out.println("4-Mostrar disco");
                        System.out.println("-----------------------------");

                        for(int i = 0; i < discos.size(); i++){
                            System.out.println(discos.get(i));
                        }

                        break;
                    case 5:
                        System.out.println("5-Salir");
                        System.out.println("-----------------------------");
                        System.exit(0);
                        break;
                }
            }
        }
        catch(Exception e){

        }
    }
}
