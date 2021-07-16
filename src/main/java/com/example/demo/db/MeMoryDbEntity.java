package com.example.demo.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MeMoryDbEntity {
    protected Integer index;
    protected String id;
}
