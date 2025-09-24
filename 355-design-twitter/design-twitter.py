class Twitter:

    def __init__(self):
        self.timer = 0
        self.tweets = defaultdict(list)
        self.following = defaultdict(set)

    def postTweet(self, userId: int, tweetId: int) -> None:
        self.timer+=1 
        self.tweets[userId].append((self.timer,tweetId))

    def getNewsFeed(self, userId: int) -> List[int]:
        heap = []
        users = self.following[userId] | {userId}

        for uid in users:
            for time , tid in self.tweets[uid][-10:]:
                heapq.heappush(heap, (-time,tid))
        result = []
        while heap and len(result) < 10:
                result.append(heapq.heappop(heap)[1]) #[1] -> we only need tweetid
        return result

    def follow(self, followerId: int, followeeId: int) -> None:
        if followerId != followeeId:
            self.following[followerId].add(followeeId)

    def unfollow(self, followerId: int, followeeId: int) -> None:
        if followeeId in self.following[followerId]:
            self.following[followerId].remove(followeeId)


# Your Twitter object will be instantiated and called as such:
# obj = Twitter()
# obj.postTweet(userId,tweetId)
# param_2 = obj.getNewsFeed(userId)
# obj.follow(followerId,followeeId)
# obj.unfollow(followerId,followeeId)