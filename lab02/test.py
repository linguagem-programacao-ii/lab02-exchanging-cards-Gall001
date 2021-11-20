count1, count2 = [int(x) for x in input("Enter alice and betty card: ").split()]
list1 = []
list2 = []
trades = 0
less = count1
if count2 < less:
    less = count2
for x in range(count1):
    alicecards = int(input('alice card: '))
    list1.append(alicecards)
for x in range(count2):
    bettycards = int(input('betty card: '))
    list2.append(bettycards)
for x in list1:
     for c in list2:
        if x == c:
            trades += 1
if trades != count1:
    realTrades = less-trades
    print("trades:")
    print(realTrades)
else:
    print('they wont trade')
