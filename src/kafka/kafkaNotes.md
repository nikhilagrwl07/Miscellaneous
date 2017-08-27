1. Nodes/broker/servers all are same
2. One topic can have multiple partition. Reason why we do partition is different partition is placed in different machine/server which in turn
allow better memory usage, disk usage etc.
3. Topic name , partition and offset . With these 3 things we can uniquely identify a message in kafka
4. Each broker have multiple partitions in provide high avaliablity
4. Orange box in each broker represent leader in kafka. All reads and writes by consumer goes to leader. Rest all are replicas
5. Producer read and write on leader , messages will be replicated by leader to replicas. In turn, replicas send ack to leader that they got the message.
6.




