# A pre-processed Juliet 1.3 dataset for LLM and SCAT testing
Original dataset is published by NSA Center for Assured Software and is available here: https://samate.nist.gov/SARD/test-suites/111.
Both the original and modified dataset are available under the CC0 1.0 Public Domain License.

This repository contains multiple branches. The dataset use in the study is in the `main` branch. 

## Manual processes
1. First the testcases in MITRE top 25 and the sub-categories of the top 25 were selected from the Juliet 1.3 full set.
2. Then the ant build tooling was replaced with gradle tooling.
3. This state was uploaded to the branch `original-set`.
4. Use IntelliJ code reformatting to reformat the code. This makes it easier to read and compacts the code a little.

## Automated pre-processing steps
Then the tooling in `https://github.com/katamb/thesis-scripts/tree/main/dataset-normalization` was used to prepare the
dataset further for LLM testing. Firstly we don't want to give LLMs clues about the vulnerabilities in the files.
So we remove comments and mentions of "good" or "bad" which could give away the answer. Secondly we don't want to waste
tokens, as running LLMs is expensive, so we want to remove unnecessary whitespace. The steps taken:
1. Run `remove-comments.py` to remove all comments and extra whitespace from the test files.
2. Run `prune-testcases.py` to remove the more complex testcases. Similarly to what was done for example here: https://arxiv.org/pdf/2311.16169.pdf
3. Run `split-files.py` to split files into 2: good case and bad case.
4. Run `remove-clues.py` script to also rename the files and most of the methods.
   After that, some manual processing were required, e.g.
   replacing all instances of "good" and "bad" in remaining variable and method names.
   Also, to help later classifications, a `file-mapping.csv` file is added to the root which maps the new obscure files
   to the vulnerabilities and marks whether the file is vulnerable or not.
5. The resulting dataset is in the `main` and `full-pre-processed-set` branches.

NB!: The package names are not changed here. Before sending the files to LLM, the script replaces the package name. 
Feel free to change the package names in the pre-processing steps, however to simplify some manual steps, 
we only overwrote the package names before sending the file to the LLM.

## Stats about current dataset
| CWE       | Count   |
|-----------|---------|
| CWE-23    | 34      |
| CWE-36    | 34      |
| CWE-78    | 34      |
| CWE-80    | 34      |
| CWE-81    | 34      |
| CWE-83    | 34      |
| CWE-89    | 34      |
| CWE-129   | 34      |
| CWE-190   | 34      |
| CWE-256   | 34      |
| CWE-259   | 34      |
| CWE-321   | 34      |
| CWE-476   | 34      |
| CWE-523   | 34      |
| CWE-549   | 34      |
| CWE-566   | 34      |
| CWE-606   | 34      |
| --------- | ------- |
| SUM       | 578     |

This currently contains 578 testcases, from which 289 are "good" and 289 are "bad". 
