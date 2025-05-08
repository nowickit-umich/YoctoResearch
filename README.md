# Yocto Research
Yocto Project reference build experiments

### Simplified Yocto Overview

This is a simplified conceptual model that does not include most details. 

![yoctoOverview](https://github.com/user-attachments/assets/bf7c1e41-c06f-4fe9-b2dc-002131d97090)

### Basic CI Optimization

![SimpleCIOverview](https://github.com/user-attachments/assets/a5afcf65-2bf9-415e-b116-80b168355fd9)

The cache should be stored locally (on the runner) in order to speed up builds. This does not seem to be possible with github caching alone.
