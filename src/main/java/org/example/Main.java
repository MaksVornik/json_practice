package org.example;

import bankData.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).findAndRegisterModules();
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "mainFile.json");
        Consumer consumer = objectMapper.readValue(file, Consumer.class);

        System.out.println(firstTask(consumer));

        System.out.println(secondTask(consumer));

        System.out.println(thirdTask(consumer));
    }

    //1️⃣ Нужно написать метод который будет считать сколько в этом отчете сделок с НЕ нулевым кредитным лимитом.
    public static int firstTask(Consumer consumer) {
        return (int) consumer
                .getConsumerData()
                .getCais().stream()
                .map(CAIS::getCaisDetails)
                .flatMap(Collection::stream)
                .filter(el -> el.getCreditLimit() != null).filter(el -> Integer.parseInt(el.getCreditLimit().getAmount().substring(1)) > 0).count();
    }

    //2️⃣ Написать метод который будет находить максимальный баланс по всем сделкам.
    public static int secondTask(Consumer consumer) {
        return (int) consumer
                .getConsumerData()
                .getCais().stream()
                .map(CAIS::getCaisDetails)
                .flatMap(Collection::stream)
                .filter(el -> el.getBalance() != null)
                .filter(el -> el.getBalance().getAmount() != null)
                .mapToInt(el -> Integer.parseInt(el.getBalance().getAmount().substring(1))).max().orElse(0);
    }


    //3️⃣ Написать метод который будет находить тип сделки с самым большим кредитным лимитом только среди тех сделок
    // которые были заключены (см. дата старта) за последние полтора года.
    public static String thirdTask(Consumer consumer) {
        LocalDate ld = LocalDate.now().minusYears(1).minusMonths(6);
        return consumer.getConsumerData().getCais()
                .stream().map(CAIS::getCaisDetails)
                .flatMap(Collection::stream)
                .filter(elements -> elements.getCaisAccStartDate().isAfter(ld))
                .filter(elem -> elem.getCreditLimit() != null)
                .max((x, y) -> Integer.parseInt(x.getCreditLimit().getAmount().substring(1))
                        - Integer.parseInt(y.getCreditLimit().getAmount().substring(1))).map(CAISDetails::getAccountType).get();

    }

    //4️⃣ Написать метод который будет находить общее количество обновлений с просрочкой 1 или более месяцев по всем сделкам которые были заключены за последние 2 года.
    //У каждой сделки нужно брать такое кол-во последних обновлений, которое будет равно количеству общих месяцев в двух отрезках дат для каждой сделки:
    //1. дата старта сделки и дата последнего обновления сделки.
    //2. нынешняя дата и дата полтора года назад от нынешней.
    //
    //Толкование значений полей из отчета (что есть что) буду писать по мере возникновения вопросов, чтобы не перегружать инфой

//    public static int fourthTask(Consumer consumer) {
//        LocalDate ld = LocalDate.now().minusYears(2);
//        return consumer
//                .getConsumerData()
//                .getCais()
//                .stream()
//                .map(CAIS::getCaisDetails)
//                .flatMap(Collection::stream)
//                .filter(e -> e.getCaisAccStartDate().isAfter(ld))
//                .filter(el -> el.getAccountBalances() != null)
//                .filter(caisDetails -> caisDetails.getAccountBalances())
//
//    }
}
