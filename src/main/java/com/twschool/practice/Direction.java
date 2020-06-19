package com.twschool.practice;

public enum  Direction {
    E {
        @Override
        public Direction leftDirection() {
            return Direction.N;
        }
    },S {
        @Override
        public Direction leftDirection() {
            return Direction.W;
        }
    },W {
        @Override
        public Direction leftDirection() {
            return Direction.S;
        }
    },N {
        @Override
        public Direction leftDirection() {
            return Direction.W;
        }
    };
    public abstract Direction leftDirection();

}

