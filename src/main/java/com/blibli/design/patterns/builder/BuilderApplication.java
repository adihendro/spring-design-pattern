package com.blibli.design.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BuilderApplication {

    @Builder
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Mahasiswa{
        private String nim;
        private String nama;
        private String alamat;
        private Date tanggalLahir;
        private List<String> hobi;
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();

        Mahasiswa mahasiswa2 = Mahasiswa.builder()
                .nim("298391")
                .nama("Adi")
                .alamat("Indonesia")
                .tanggalLahir(new Date())
                .hobi(Arrays.asList("Game", "Coding"))
                .build();
    }
}
