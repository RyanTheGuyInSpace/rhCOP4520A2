This implementation uses the sign-on-the-door strategy. 
The advantage of this approach is the guests don't need to constantly
look stare at the door or wait in line to get into the showroom. They can 
do their own thing while someone else is in the showroom, then whenever they
have free time they can check the door and see if they can get in.

The advantage of this approach is the threads can continue to do other things
while waiting for the showroom to be available. The disadvantage is that
each guest may not necessarily view the showroom at the earliest possible
time. We would get the reverse problem if we went with the Queue solution.
The guests would be able to get into the showroom and everyone would finish
viewing it much faster. The drawback is the those threads would constantly
be waiting to enter and potentially waste time waiting when they could
be doing something else during the wait. If the ultimate goal is
to finish all showroom viewing as quickly as possible, that would probably
be the best solution. I decided that the sign on the door is the best for
the guests to enjoy the party and to view the crystal vase whenever it's
convenient for them.