class Solution {
    enum class Direction {
        NORTH, EAST, SOUTH, WEST
    }
    fun robotSim(commands: IntArray, obstacles: Array<IntArray>): Int {
        var obstacleMap = mutableSetOf<Pair<Int, Int>>()
        for (obstacle in obstacles) {
            obstacleMap.add(Pair(obstacle[0], obstacle[1]))
        }
        var current = Direction.NORTH
        var x = 0
        var y = 0
        var max = 0
        for (command in commands) {
            when (command) {
                -1 -> {
                    current = when (current) {
                        Direction.NORTH -> Direction.EAST
                        Direction.EAST -> Direction.SOUTH
                        Direction.SOUTH -> Direction.WEST
                        Direction.WEST -> Direction.NORTH
                    }
                }
                -2 -> {
                    current = when (current) {
                        Direction.NORTH -> Direction.WEST
                        Direction.WEST -> Direction.SOUTH
                        Direction.SOUTH -> Direction.EAST
                        Direction.EAST -> Direction.NORTH
                    }
                }
                else -> {
                    when (current) {
                        Direction.NORTH -> {
                            move@ for (i in 1..command) {
                                if (obstacleMap.contains(Pair(x, y + 1))) {
                                    break@move
                                }
                                y += 1
                                max = maxOf(y * y + x * x, max)
                            }
                        }
                        Direction.EAST -> {
                            move@ for (i in 1..command) {
                                if (obstacleMap.contains(Pair(x + 1, y))) {
                                    break@move
                                }
                                x += 1
                                max = maxOf(y * y + x * x, max)
                            }
                        }
                        Direction.SOUTH -> {
                            move@ for (i in 1..command) {
                                if (obstacleMap.contains(Pair(x, y - 1))) {
                                    break@move
                                }
                                y -= 1
                                max = maxOf(y * y + x * x, max)
                            }
                        }
                        Direction.WEST -> {
                            move@ for (i in 1..command) {
                                if (obstacleMap.contains(Pair(x - 1, y))) {
                                    break@move
                                }
                                x -= 1
                                max = maxOf(y * y + x * x, max)
                            }
                        }
                    }
                }
            }
        }
        return max
    }
}
