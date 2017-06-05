package com.lico.study.lombok;

import lombok.ToString;

import java.util.*;

/**
 * 项目：lico-study
 * 包名：com.lico.study.lombok
 * 功能：
 * 时间：2017-06-05
 * 作者：呱牛
 */
@ToString
public class BuilderExample2 {

    private String name;
    private int age;
    private Set<String> occupations;

    BuilderExample2(String name, int age, Set<String> occupations) {
        this.name = name;
        this.age = age;
        this.occupations = occupations;
    }

    public static BuilderExample2Builder builder() {
        return new BuilderExample2Builder();
    }


    @ToString
    public static class BuilderExample2Builder {
        private String name;
        private int age;
        private ArrayList<String> occupations;

        BuilderExample2Builder() {
        }

        public BuilderExample2Builder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderExample2Builder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderExample2Builder occupation(String occupation) {
            if (this.occupations == null) {
                this.occupations = new ArrayList<>();
            }

            this.occupations.add(occupation);
            return this;
        }

        public BuilderExample2Builder occupations(Collection<? extends String> occupations) {
            if (this.occupations == null) {
                this.occupations = new ArrayList<>();
            }

            this.occupations.addAll(occupations);
            return this;
        }

        public BuilderExample2Builder clearOccupations() {
            if (this.occupations != null) {
                this.occupations.clear();
            }

            return this;
        }

        public BuilderExample2 build() {
            Set<String> occupations;
            if (this.occupations == null) {
                occupations = Collections.emptySet();
            } else {
                occupations = new LinkedHashSet<>();
                occupations.addAll(this.occupations);
            }
            return new BuilderExample2(name, age, occupations);
        }
    }
}
