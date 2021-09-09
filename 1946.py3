import sys

testcase = int(input())
for _ in range(testcase):
    number_of_applicants = int(input())
    applicant_list = [0] * number_of_applicants
    
    for _ in range(number_of_applicants):
        # a, b = map(int, input().split()) : time_over
        a, b = map(int, sys.stdin.readline().split())
        applicant_list[a - 1] = b - 1 # convert 1~ to 0~

    pass_applicants = 0
    min = 100000
    for score in applicant_list:
        if min > score:
            min = score
            pass_applicants += 1

    print(pass_applicants)