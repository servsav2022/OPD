package lab3;
import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Запланированный бюджет проекта: ");
        float planBudget = in.nextFloat();
        System.out.print("Запланированный срок выполнения проекта: ");
        float planDate = in.nextFloat();
        System.out.print("Время проверки на \"сегодня\": ");
        float timeCheck = in.nextFloat();
        System.out.print("Степень готовности проекта на \"сегодня\": ");
        float readyToday = in.nextFloat();
        System.out.print("Расходы проекта: ");
        float prjCosts = in.nextFloat();

        float ad = (timeCheck * 100)/ readyToday;    // оценка времени завершения проекта
        float cd = ad - planDate;                    // задержка сроков
        float dj = (ad * prjCosts) / timeCheck;      // оценка всего бюджета
        float hi = dj - planBudget;                  // перерасход бюджета

        System.out.println("Задержка сроков проекта составила: " + cd + " мес.");
        System.out.println("Перерасход бюджета проекта : " + hi +" у.е. ");
        }
}
