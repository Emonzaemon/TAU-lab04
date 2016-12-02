Given a roman converter
When set arabic to 3
Then result is "III"

When set arabic to 1
Then result should be not null

When set arabic to -1
Then message should appear Invalid Roman Number Value

