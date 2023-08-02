class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    
    Deque<Integer> deque = new LinkedList<>(arr);

    // Calculate the number of rotations needed (modulo to avoid unnecessary rotations)
    int rotations = d % arr.size();

    // Perform the left rotation
    for (int i = 0; i < rotations; i++) {
        int first = deque.removeFirst();
        deque.addLast(first);
    }

    // Convert the Deque back to a List and return it
    return new ArrayList<>(deque);

    }

}