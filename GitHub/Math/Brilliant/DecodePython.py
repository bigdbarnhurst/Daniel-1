count = 0
sequence_1 = 'ThisIsAStringOfCode'
sequence_2 = 'HereIsAStringInCode'

for i in range(0,len(sequence_1)):
    if sequence_1[i] != sequence_2[i]:
        count = count + 1

print(count)