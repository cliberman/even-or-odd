package com.example.evenorodd.service;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

@Builder
@Service
@Data
public class EvenOddService {
    public static String returnAnswer(int num) {

        String output = "";
        if (num % 2 == 0) {
            output = "even";
        }
        else {
            output = "odd";
        }
        return output;
    }
}
