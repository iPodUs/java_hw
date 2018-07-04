package main.java.Skills;

public class Intelligence {

    private int sensation, perception, memory, presentation, thinking, imagination;

    public static class Builder {

        int memory;
        int thinking;
        int sensation = 3;
        int perception = 3;
        int presentation = 3;
        int imagination = 3;

        public Builder(int memory, int thinking) {
            this.memory = memory;
            this.thinking = thinking;
        }

        public Builder sensation(int val) {
            sensation = sensation;
            return this;
        }

        public Builder perception(int val) {
            perception = perception;
            return this;
        }

        public Builder presentation(int val) {
            presentation = val;
            return this;
        }

        public Builder imagination(int val) {
            imagination = val;
            return this;
        }

        public Intelligence build() {
            return new Intelligence(this);
        }
    }

    private Intelligence(Builder builder) {
        memory = builder.memory;
        thinking = builder.thinking;
        sensation = builder.sensation;
        perception = builder.perception;
        presentation = builder.presentation;
        imagination = builder.imagination;
    }
}
