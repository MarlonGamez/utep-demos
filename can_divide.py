def canDivide(A):
	# take one element (First one), separate the rest into two groups and then keep changing
    index = 0
    list1 = []
    list2 = []

    int[] arr1 = new int[A.length]
    int[] arr2 = new int[A.length]

    list1.append(A[index])
    # use arr.clone() instead of list.copy()
    return helper(A, list1.copy(), list2.copy(), index + 1) or helper(A, list2.copy(), list1.copy(), index + 1)

def helper(A, list1, list2, currI):
    if currI == len(A):
        return sum(list1) == sum(list2)

    list1.append(A[currI])
    arr1[currI] = A[currI]
    return helper(A, list1.copy(), list2.copy(), currI + 1) or helper(A, list2.copy(), list1.copy(), currI + 1)
# JAVA SUM
# public static int sum(int[] array) {
#     int sum = 0;
#     for (int value : array) {
#         sum += value;
#     }
#     return sum;
# }

def main():
    print(canDivide([10, 10, 2, 2, 1, 1]))
    print(canDivide([2, 2, 10, 10, 1, 1]))
    print(canDivide([1, 2, 3, 4, 5]))

if __name__ == "__main__":
    main()