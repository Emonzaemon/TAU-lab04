Given a psikus instance
When set argument 1 to cyfrokrad
Then result is equal to null

When set argument 1234 to cyfrokrad
Then result is not null and equal to 123, or 124, or 134, or 234

When set argument 12 to hultajchochla
Then result is equal to 21

When set argument 1 to hultajchochla
Then an nieudany psikus exception is thrown

When set argument 376 to nieksztaltek
Then result is equal to 876, or 316, or 379

When set argument 124 to nieksztaltek
Then result still equal to 124