# Arxiv Vanity

Android app to open the Arxiv-Vanity page for a specific url.

## Implementation

The code performs a regex match against the url supplied, looking for the characteristic arxiv id:

```
1\d{3}\.\d+
```
