package com.revature;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Trainer {
    private String name;
    private Pokemon starter;
    private int num_badges;
}
