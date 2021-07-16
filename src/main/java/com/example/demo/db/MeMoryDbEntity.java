package com.example.demo.db;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class MeMoryDbEntity {
    protected Integer index;
    protected String id;
}
